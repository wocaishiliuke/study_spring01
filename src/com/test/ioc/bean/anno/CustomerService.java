package com.test.ioc.bean.anno;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Component
 * 相当于spring容器中定义：<bean id="customerService"  class="com.test.ioc.bean.anno">
 * 其中不指定bean的id/name时，id属性默认bean的名字是类名的小写
 * ——————————————————————————————————————————————————
 * @Component(value="xxx")//自定义bean名称
 * 相当于：<bean id="xxx" class="com.test.ioc.bean.anno">
 * ——————————————————————————————————————————————————
 */
//@Component(value = "customerService")
@Service
public class CustomerService {
	//简单数据类型注入
	@Value(value = "Rose")
	private String name;
	
	//方式1：按id注入。其中customerDao表示<bean>节点的id
	/*@Value("#{customerDao}")
	private CustomerDao customerDao;*/
	
	private CustomerDao customerDao;
	
	//@Autowired
	/*@Autowired
	@Qualifier("customerDao")*/
	//@Resource()
	//@Resource(name = "customerDao")
	//@Inject
	@Inject
	@Named("customerDao")
	public void abc(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	//@Value("#{customerDao}")
	//@Autowired
	/*@Autowired
	@Qualifier("customerDao")*/
	//@Resource()
	//@Resource(name = "customerDao")
	//@Inject
	/*@Inject
	@Named("customerDao")
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}*/
	
	//方式2：按class注入。其中customerDao表示<bean>节点的id
	/*@Autowired
	private CustomerDao customerDao;*/
	
	//方式3：按id注入。Autowired默认按class注入；想按id注入，必须配合@Qualifier
	/*@Autowired
	@Qualifier("customerDao")
	private CustomerDao customerDao;*/
	
	//方式4：默认先按id注入，找不到，再按class注入，找不到抛异常
	/*@Resource()
	private CustomerDao customerDao;*/
	
	//方式5：只按id注入，找不到抛异常
	/*@Resource(name = "customerDao")
	private CustomerDao customerDao;*/
	
	//方式6：默认按类型注入
	/*@Inject
	private CustomerDao customerDao;*/
	
	//方式7：默认按类型注入;若按名字注入，必须配合@Named使用
	/*@Inject
	@Named("customerDao")
	private CustomerDao customerDao;*/
	
	public void save(){
		System.out.println("CustomerService业务层被调用了。。。");
		System.out.println(name);
		customerDao.save();
	}
}