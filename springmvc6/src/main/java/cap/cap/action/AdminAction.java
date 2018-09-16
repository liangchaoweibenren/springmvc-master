package cap.action;

import com.opensymphony.xwork2.ActionSupport;
import cap.service.StudentService;

import cap.bean.Admin;
import cap.util.PageBean;

public class AdminAction extends ActionSupport{
    private StudentService sdService;
    private PageBean pageBean;
    private int pageNo = 1;
    private Student admin;

    public StudentService getSdService() {
        return sdService;
    }

    public void setSdService(StudentService sdService) {
        this.sdService = sdService;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public Student getAdmin() {
        return admin;
    }

    public void setAdmin(Student admin) {
        this.admin = admin;
    }

    public String index(){
        pageBean = sdService.getStListPage(pageNo, 5);
        return SUCCESS;
    }

    public String addStu(){
        sdService.addSt(admin);
        return SUCCESS;
    }
}