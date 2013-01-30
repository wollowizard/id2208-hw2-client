/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.SwingUtilities;
import pck.AuthenticationException_Exception;
import pck.Route;

/**
 *
 * @author Gerard
 */
public class Controller {

    public static String tokenId="";
    
    public static String getTkn(java.lang.String usr, java.lang.String pwd) {
        pck.GetToken_Service service = new pck.GetToken_Service();
        pck.GetToken port = service.getGetTokenPort();
        return port.getTkn(usr, pwd);
    }

    static Boolean getTokenService(String username, String password) {
        Controller.tokenId=Controller.getTkn(username, password);
        if(Controller.tokenId.equals("INVALID USERNAME OR PASSWORD")){
            return false;
        }
        return true;
        
    }

    public static java.util.List<pck.FlightsList> getItinerary(java.lang.String from, java.lang.String to, java.lang.String tokenid) throws AuthenticationException_Exception {
        pck.Itinerary_Service service = new pck.Itinerary_Service();
        pck.Itinerary port = service.getItineraryPort();
        return port.getItinerary(from, to, tokenid);
    }
    
    
    //should it return an array of routes????????????
    
    public static Route findPrice(java.lang.String from, java.lang.String to, java.lang.String flightsId, java.lang.String date, java.lang.String tokenid) throws AuthenticationException_Exception {
        pck.FindPrice_Service service = new pck.FindPrice_Service();
        pck.FindPrice port = service.getFindPricePort();
        return port.findPrice(from, to, flightsId, date, tokenid);
    }
    
    
    
}
