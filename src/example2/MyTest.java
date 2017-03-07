/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech13@interface
 * 描述信息: 
 * 创建日期：2015年12月14日 下午6:49:23 
 * @author malitao
 * @version 
 */
package example2;

//import example2.bean.TestAnnotation;
//import example2.bean.TrafficLamp;

/** 
 *  
 * 创建日期：2015年12月14日 下午6:49:23 
 * @author malitao
 */
//@MyAnnotation(hello = "beijing", world="shanghai",array={},lamp=TrafficLamp.RED,style=int.class)
@MyAnnotation(hello = "beijing", world="shanghai")
public class MyTest {
//	@MyAnnotation(lannotation = @TestAnnotation(value = "baby") , world = "shanghai", array = { 1, 2, 3 }, lamp = TrafficLamp.YELLOW)
	@MyAnnotation(world = "shanghai")
	@Deprecated
	public void output() {
		System.out.println("output something!");
	}
	
	public void output1(){
		System.out.println("output1 something1 !");
	}
}
