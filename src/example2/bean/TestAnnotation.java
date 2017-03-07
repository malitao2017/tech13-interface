/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称：tech13@interface
 * 描述信息: 
 * 创建日期：2015年12月14日 下午6:46:32 
 * @author malitao
 * @version 
 */
package example2.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/** 
 *  
 * 创建日期：2015年12月14日 下午6:46:32 
 * @author malitao
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
	String value() default "ddd";  
}
