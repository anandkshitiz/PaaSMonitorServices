package paasmonitorsvc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestSvc {
    public TestSvc() {
        super();
    }
    
    @GET
    public String getTestMessgae(){
        return "Test OK";
    }
}
