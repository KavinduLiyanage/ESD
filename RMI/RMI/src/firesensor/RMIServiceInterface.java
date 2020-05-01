package firesensor;

import Models.Sensor;
import Models.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RMIServiceInterface extends Remote{
    
    User searchUser(User u) throws RemoteException;      
    Sensor searchSensor(Sensor s)throws RemoteException;
    
    List<User> allUser() throws RemoteException;           
    List<Sensor> allSensors() throws RemoteException;    
        
}
