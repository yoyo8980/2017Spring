package com.hb.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list.json")
public class JsonController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json; charset=UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");//접근권한주기
		response.setHeader("Access-Control-Allow-Method", "GET, POST");//접근권한주기
		PrintWriter out = response.getWriter();
		out.print("{\"root\":[");
		out.print("{\"sabun\":\"1111\", \"email\":\"user1@gmail.com\",\"pay\":\"2000\"}");
		out.print(",");
		out.print("{\"sabun\":\"2222\", \"email\":\"user2@gmail.com\",\"pay\":\"2200\"}");
		out.print(",");
		out.print("{\"sabun\":\"3333\", \"email\":\"user3@gmail.com\",\"pay\":\"2300\"}");
		out.print(",");
		out.print("{\"sabun\":\"4444\", \"email\":\"user4@gmail.com\",\"pay\":\"2400\"}");
		out.print("]}");
		out.close();
	}

	
}
