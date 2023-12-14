package cn.bugstack.springframework.beans.factory;

/**
 * @author LIN
 * @date 2023/12/14 15:21
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
