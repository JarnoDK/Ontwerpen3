package domein;

import java.lang.reflect.*;

public class NonOwnerInvocationHandler implements InvocationHandler  {

	private PersonBean personbean;
	
	public NonOwnerInvocationHandler(PersonBean personBean) {
		this.personbean = personBean;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		
		try {
			if(method.getName().toLowerCase().startsWith("get")) {
				return method.invoke(personbean, args);
			}
			
			if(method.getName().equalsIgnoreCase("setHotOrNotRating")) {
				return method.invoke(personbean, args);
			}
			if(method.getName().startsWith("set")) {
				throw new IllegalAccessException("No access to use a set method");
			}
			
			
		}catch(IllegalAccessException ex) {
			return null;
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return null;
	}


    
    
    
    
}


