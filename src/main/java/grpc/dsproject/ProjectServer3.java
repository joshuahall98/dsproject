package grpc.dsproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.dsproject.CalculateRequest3.Operation3;
import grpc.dsproject.ProjectService3Grpc.ProjectService3ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ProjectServer3 extends ProjectService3ImplBase{

public static void main(String[] args) {
		
		ProjectServer3 projectserver3 = new ProjectServer3();
		
		Properties prop = projectserver3.getProperties();
		
		projectserver3.registerService(prop);
		
		int port = 50053;
		
		try {
			Server server = ServerBuilder.forPort(port).addService(projectserver3).build().start();
			
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
		
		 try (InputStream input = new FileInputStream("src/main/resources/project3.properties")) {

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
	public void calculate3(CalculateRequest3 request,
	        StreamObserver<CalculateResponse3> responseObserver) {
		
		
		System.out.println("receiving calculate method " + request.getWeight2() + request.getHeight() + request.getAge() +request.getOperation3Value() );
		
		double value = Float.NaN;
		String msg = "";
		

		if(	request.getOperation3()==Operation3.male)
			value = 66 + (request.getWeight2() * 13.9) + (12.9 * request.getHeight() - (6.8 * request.getAge()));
		else if(request.getOperation3()==Operation3.female)
			value = 665 + (request.getWeight2() * 9.5) + (4.7 * request.getHeight() - (4.7 * request.getAge()));
		else {
			value = Float.NaN;
			msg = "no supported/implemented operation";
		}
		

		
//		value = request.getNumber1() + 10;
		msg = "Needed daily calories = " + value;
		

		
		
		System.out.println(msg);
		
		CalculateResponse3 reply = CalculateResponse3.newBuilder().setCalories3(value).setCaloriesmessage3(msg).build();

		responseObserver.onNext(reply);

		responseObserver.onCompleted();
		
	}
	
	
	
	
}
