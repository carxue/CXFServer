package bing.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import com.sun.istack.internal.logging.Logger;

public class IPCXFInInterceptor extends AbstractPhaseInterceptor<Message>{
	
	private static final Logger log = Logger.getLogger(IPCXFInInterceptor.class);

	 public IPCXFInInterceptor(String phase) {  
	        super(phase);  
	    }  
	      
	    public IPCXFInInterceptor() {  
	        super(Phase.RECEIVE);  
	    }  
	@Override
	public void handleMessage(Message arg0) throws Fault {
		HttpServletRequest request = (HttpServletRequest) arg0
				.get(AbstractHTTPDestination.HTTP_REQUEST);
		log.info("ÓÃ»§ipÎª£º"+request.getRemoteAddr());
		
	}

}
