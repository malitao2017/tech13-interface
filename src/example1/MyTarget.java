/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech13@interface
 * 描述信息: 
 * 创建日期：2015年12月14日 下午6:39:19 
 * @author malitao
 * @version 
 */
package example1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/** 
 *  
 * 创建日期：2015年12月14日 下午6:39:19 
 * @author malitao
 */
//注解@Retention可以用来修饰注解，是注解的注解，称为元注解。
//Retention注解有一个属性value，是RetentionPolicy类型的，Enum RetentionPolicy是一个枚举类型，
//这个枚举决定了Retention注解应该如何去保持，也可理解为Rentention 搭配 RententionPolicy使用。RetentionPolicy有3个值：CLASS  RUNTIME   SOURCE
//用@Retention(RetentionPolicy.CLASS)修饰的注解，表示注解的信息被保留在class文件(字节码文件)中当程序编译时，但不会被虚拟机读取在运行的时候；
//用@Retention(RetentionPolicy.SOURCE )修饰的注解,表示注解的信息会被编译器抛弃，不会留在class文件中，注解的信息只会留在源文件中；
//用@Retention(RetentionPolicy.RUNTIME )修饰的注解，表示注解的信息被保留在class文件(字节码文件)中当程序编译时，会被虚拟机保留在运行时，
//所以他们可以用反射的方式读取。RetentionPolicy.RUNTIME 可以让你从JVM中读取Annotation注解的信息，以便在分析程序的时候使用.

//@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.SOURCE )
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTarget {

}
