package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.bean.class_field.ClassFieldCar;
import ro.cozmanca.bean.class_field.ClassFieldCompany;
import ro.cozmanca.bean.constructor.ConstructorCar;
import ro.cozmanca.bean.constructor.ConstructorCompany;
import ro.cozmanca.bean.constructorAndMultiple.ConstructorAndMultipleCompany;
import ro.cozmanca.bean.multiple.MultipleCar;
import ro.cozmanca.bean.multiple.MultipleCompany;
import ro.cozmanca.bean.setter.SetterCar;
import ro.cozmanca.bean.setter.SetterCompany;
import ro.cozmanca.config.ProjectConfig;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ClassFieldCar classFieldCar = context.getBean(ClassFieldCar.class);
        System.out.println(classFieldCar);

        ClassFieldCompany classFieldCompany = context.getBean(ClassFieldCompany.class);
        System.out.println(classFieldCompany);

        ConstructorCar constructorCar = context.getBean(ConstructorCar.class);
        System.out.println(constructorCar);

        ConstructorCompany constructorCompany = context.getBean(ConstructorCompany.class);
        System.out.println(constructorCompany);

        SetterCar setterCar = context.getBean(SetterCar.class);
        System.out.println(setterCar);

        SetterCompany setterCompany = context.getBean(SetterCompany.class);
        System.out.println(setterCompany);

        MultipleCompany multipleCompanyWithPrimaryCar = context.getBean("multipleCompanyWithPrimaryCar",MultipleCompany.class);
        System.out.println(multipleCompanyWithPrimaryCar);

        MultipleCompany multipleCompanyWithSecondMultipleBean = context.getBean("multipleCompanyWithSecondMultipleBean",MultipleCompany.class);
        System.out.println(multipleCompanyWithSecondMultipleBean);

        ConstructorAndMultipleCompany constructorAndMultipleCompany = context.getBean(ConstructorAndMultipleCompany.class);
        System.out.println(constructorAndMultipleCompany);
    }
}
