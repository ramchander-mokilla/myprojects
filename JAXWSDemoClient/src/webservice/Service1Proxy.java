package webservice;

public class Service1Proxy implements webservice.Service1 {
  private String _endpoint = null;
  private webservice.Service1 service1 = null;
  
  public Service1Proxy() {
    _initService1Proxy();
  }
  
  public Service1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initService1Proxy();
  }
  
  private void _initService1Proxy() {
    try {
      service1 = (new webservice.Service1ServiceLocator()).getService1();
      if (service1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service1 != null)
      ((javax.xml.rpc.Stub)service1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.Service1 getService1() {
    if (service1 == null)
      _initService1Proxy();
    return service1;
  }
  
  public int convertFromMtoCM(int m) throws java.rmi.RemoteException{
    if (service1 == null)
      _initService1Proxy();
    return service1.convertFromMtoCM(m);
  }
  
  public java.lang.String sayHello(java.lang.String str) throws java.rmi.RemoteException{
    if (service1 == null)
      _initService1Proxy();
    return service1.sayHello(str);
  }
  
  
}