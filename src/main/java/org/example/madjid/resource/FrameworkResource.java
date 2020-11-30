package org.example.eigennaam.resource;

import org.example.eigennaam.domain.Framework;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/frameworks")
public class FrameworkResource {

    @GET
    @Produces("application/json")
    public List<Framework> getFrameworks() {
        ArrayList<Framework> frameworks = new ArrayList<>();
        frameworks.add(new Framework(1, "Angular",   "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Angular_full_color_logo.svg/1200px-Angular_full_color_logo.svg.png", 10));
        frameworks.add(new Framework(2, "React",    "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/800px-React.svg.png", 9));
        return frameworks;
    }

}
