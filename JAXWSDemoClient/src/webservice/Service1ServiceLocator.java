/**
 * Service1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class Service1ServiceLocator extends org.apache.axis.client.Service implements webservice.Service1Service {

    public Service1ServiceLocator() {
    }


    public Service1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Service1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Service1
    private java.lang.String Service1_address = "http://localhost:8080/JAXWSDemo/services/Service1";

    public java.lang.String getService1Address() {
        return Service1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Service1WSDDServiceName = "Service1";

    public java.lang.String getService1WSDDServiceName() {
        return Service1WSDDServiceName;
    }

    public void setService1WSDDServiceName(java.lang.String name) {
        Service1WSDDServiceName = name;
    }

    public webservice.Service1 getService1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Service1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getService1(endpoint);
    }

    public webservice.Service1 getService1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.Service1SoapBindingStub _stub = new webservice.Service1SoapBindingStub(portAddress, this);
            _stub.setPortName(getService1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setService1EndpointAddress(java.lang.String address) {
        Service1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.Service1.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.Service1SoapBindingStub _stub = new webservice.Service1SoapBindingStub(new java.net.URL(Service1_address), this);
                _stub.setPortName(getService1WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Service1".equals(inputPortName)) {
            return getService1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice", "Service1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice", "Service1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Service1".equals(portName)) {
            setService1EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
