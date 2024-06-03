package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HttpServerT3 {

	public static void main(String[] args) {
		
		try {
			HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080),0);
			
			httpServer.createContext("/test");
			httpServer.createContext("/login");
			
			httpServer.start();
			
			
		} catch (Exception e) {
		}
	}
	
	static class MyHandler implements HttpHandler{

		@Override
		public void handle(HttpExchange exchange) throws IOException {
			
			String method = exchange.getRequestMethod();
			
			if("GET".equalsIgnoreCase(method)) {
				handleGetRequest(exchange);
			} else if ("POST".equalsIgnoreCase(method)) {
			}
			
		}
		
		private void handleGetRequest(HttpExchange exchange) throws IOException {
			
			//BufferedWriter bw = new BufferedWriter(new FileWriter(""))
					
			
		}
		
		
	}

}
