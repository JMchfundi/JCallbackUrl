/**
 * 
 */
package com.jocta.callback;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author root
 *
 */

@WebServlet("/mpesaCbUrl")
public class JOctaMpesaCbUrl extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2857770200967700115L;

	// service() responds to both GET and POST requests.
	// You can also use doGet() or doPost()
	@Override
	public void service(final HttpServletRequest request, final HttpServletResponse response)
			throws IOException {
		if (request.getPathInfo() == null || request.getPathInfo().isEmpty()) {
			return;
		}

		if (request.getPathInfo().equals("/assignment_callback")) {
			response.setContentType("application/json");
			response.getWriter().print("{}");
		}
	}
}

