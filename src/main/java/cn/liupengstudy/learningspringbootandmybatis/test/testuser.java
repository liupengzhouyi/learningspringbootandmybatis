/*
package cn.liupengstudy.learningspringbootandmybatis.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wukong.dao.impl.UserDaoImpl;
import com.wukong.entity.User;

*/
/**
 * Servlet implementation class testuser
 *//*

@WebServlet("/testuser")
public class testuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    */
/**
     * @see HttpServlet#HttpServlet()
     *//*

    public testuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	*/
/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String flag = request.getParameter("flag");
		UserDaoImpl impl = new UserDaoImpl();
		if("login".equals(flag)){
			String p1 = request.getParameter("username");
			String p2 = request.getParameter("pass");
			User u = impl.queryByExample(p1, p2);
			
			if(u.getUsername()!=null){
				request.getSession().setAttribute("currUser", u);//����¼���û�������session��Χ��
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			}else{
				request.setAttribute("msg", "�û��������벻ƥ��");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else if("toAddUserPage".equals(flag)){
			response.sendRedirect("register.jsp");
			
		}else if("toUpdateUserPage".equals(flag)){
			response.sendRedirect("modifyuser.jsp");
		}else if("zengjia".equals(flag)){
			String p1 = request.getParameter("username");
			String p2 = request.getParameter("pass");
			
			User u = new User();
			u.setUsername(p1);
			u.setPassword(p2);
			
			int i = impl.addUser(u);
			if (i>0) {
				response.getWriter().println("��Ӽ�¼�ɹ�");
			}else{
				response.getWriter().println("��Ӽ�¼ʧ��");
			}
		}else if("xiugai".equals(flag)){
			String p1 = request.getParameter("username");
			String p2 = request.getParameter("introduce");
			
			User u = new User();
			u.setUsername(p1);
			u.setIntroduce(p2);
			
			int i = impl.modifyUserIntro(u);
			if (i>0) {
				response.getWriter().println("�޸����¼�ɹ�");
			}else{
				response.getWriter().println("�޸ļ�¼ʧ��");
			}
		}
	}

	*/
/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
*/
