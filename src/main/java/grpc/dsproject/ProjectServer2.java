package grpc.dsproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.dsproject.CalculateRequest.Operation;
import grpc.dsproject.ProjectService2Grpc.ProjectService2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ProjectServer2 extends ProjectService2ImplBase{
	
public static void main(String[] args) {
		
		ProjectServer2 projectserver2 = new ProjectServer2();
		
		Properties prop = projectserver2.getProperties();
		
		projectserver2.registerService(prop);
		
		int port = 50052;
		
		try {
			Server server = ServerBuilder.forPort(port).addService(projectserver2).build().start();
			
			System.out.println("server started ");
			
			server.awaitTermination();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/project2.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("Project Service properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	
	private  void registerService(Properties prop) {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "example";
	           // int service_port = 1234;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

	            
	            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 
	    
	}
	
	@Override
	public void calculate2(CalculateRequest2 request,
	        StreamObserver<CalculateResponse2> responseObserver) {
		
		
		System.out.println("receiving calculate method " + request.getWeight() );
		
		double value = Float.NaN;
		String msg = "";
		


		value = request.getWeight() * 1.48;
		
//		value = request.getNumber1() + 10;
		msg = "Water in ounces you need to drink a day = " + value;
		

		
		
		System.out.println(msg);
		
		CalculateResponse2 reply = CalculateResponse2.newBuilder().setWater(value).setWatermessage(msg).build();

		responseObserver.onNext(reply);

		responseObserver.onCompleted();
		
	}

}
