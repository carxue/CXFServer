package bing.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import com.sun.istack.internal.logging.Logger;

public class CXFOutInterceptor extends AbstractPhaseInterceptor<Message>{
	
	private static final Logger log = Logger.getLogger(CXFOutInterceptor.class);

	 public CXFOutInterceptor(String phase) {  
	        super(phase);  
	    }  
	      
	    public CXFOutInterceptor() {  
	        super(Phase.SEND);  
	    }  
	@Override
	public void handleMessage(Message arg0) throws Fault {
		
		log.info("用户准备退出："+arg0.getContextualProperty("result"));
		
	}

}
