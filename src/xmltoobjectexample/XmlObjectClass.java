/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltoobjectexample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dogor-Igbosuah
 */
@XmlRootElement(name = "XmlObjectClass")
@XmlAccessorType (XmlAccessType.NONE)
public class XmlObjectClass {

    @XmlElement(name = "state")
    private String state;
    
    
     @XmlElement(name = "name")
    private String name;

    @Override
    public String toString() {
        return "XmlObjectClass{" + "state=" + state + ", name=" + name + ", age=" + age + ", id=" + id + '}';
    }

  

    @XmlElement(name = "age")
    private int age;

    @XmlAttribute
    private int id;

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
