package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.*;

import DAO.AirlineDao1;

import DataClass.Airline;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/testQueryServlet1")
public class TestQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestQueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  request.setCharacterEncoding("utf-8");
		    response.setContentType("text/html;charset=utf-8");

		//封装用于返回的对象输出流
		ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
		//封装用于接收的对象输入流
		ObjectInputStream in = new ObjectInputStream(request.getInputStream());
		String s=null;
		//按指定类的格式读取对象输入流中的内容
		try {
			 s=(String)in.readObject();
		}
		catch (java.lang.ClassNotFoundException ysy )
		{
		}
		//对接受到的数据对象进行处理
      s+="成功！！";

		//将处理后的数据对象返回到对象输出流中
		out.writeObject(s);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //���ñ����ʽ
		doGet(request, response);
	
	}

}
