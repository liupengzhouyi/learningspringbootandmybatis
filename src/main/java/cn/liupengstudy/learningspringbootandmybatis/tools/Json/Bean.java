package cn.liupengstudy.learningspringbootandmybatis.tools.Json;

public class Bean {

    private int id;

    private JavaBean javaBean;

    public Bean(int id, JavaBean javaBean) {
        this.id = id;
        this.javaBean = javaBean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JavaBean getJavaBean() {
        return javaBean;
    }

    public void setJavaBean(JavaBean javaBean) {
        this.javaBean = javaBean;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "id=" + id +
                ", javaBean=" + javaBean +
                '}';
    }
}
