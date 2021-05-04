package domein;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SimpleUserInvocationHandler implements InvocationHandler {
	
    private IStockService stockService;
    
    public SimpleUserInvocationHandler(IStockService stockService) {
        this.stockService = stockService;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws AccessDeniedException {
        try {
            if (method.getName().equals("productenView")) { //hier alle toegelaten methoden voor een simpleUser
                return method.invoke(stockService, args);
            }
            throw new AccessDeniedException();
        } catch (InvocationTargetException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}