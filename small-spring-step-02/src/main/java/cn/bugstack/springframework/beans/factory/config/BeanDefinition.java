package cn.bugstack.springframework.beans.factory.config;

/**
 * @author LIN
 * @date 2023/11/29 14:06
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }
}
