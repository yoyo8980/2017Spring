package com.hb.upDown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	String path="C:\\ztest\\upload\\";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home2";
	}
	@RequestMapping(value="/up", method=RequestMethod.POST)
	public String up(int sabun, Model model, @RequestParam("file") MultipartFile file) {
		logger.debug(file.getOriginalFilename());
		File f = new File(path+file.getOriginalFilename());
		System.currentTimeMillis();
		try {
			file.transferTo(f);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("fname",file.getOriginalFilename());
		return "result";
	}
	@RequestMapping("/download")
	public void download(@RequestParam("fname") String fname, HttpServletResponse resp) {
		
		resp.setContentType("application/octet-stream; charset=UTF-8");
		resp.setHeader("Content-Disposition", "attachment; filename=\""+fname+"\""); 
		File file= new File(path+fname);
		FileInputStream fis = null;
		OutputStream os=null;
		try {
			fis=new FileInputStream(file);
			os=resp.getOutputStream();
			FileCopyUtils.copy(fis, os);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				os.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		try ()
//			FileInputStream fis=new FileInputStream(file);
//			OutputStream os=resp.getOutputStream())
//			{FileCopyUtils.copy(fis, os);
//		} 
	}
}
