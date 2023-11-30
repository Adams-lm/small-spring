package cn.bugstack.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LIN
 * @date 2023/11/30 14:42
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;

    }
}
