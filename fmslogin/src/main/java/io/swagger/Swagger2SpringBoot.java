package io.swagger;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

import com.fms.entity.Test;
import com.fms.entity.Employee;
import com.fms.entity.EmployeeEvent;
import com.fms.entity.EventPrimaryKey;
import com.fms.entity.EventSummary;
import com.fms.repository.EmployeeEventRepository;
import com.fms.repository.EmployeeRepository;
import com.fms.repository.EventSummaryRepository;
import com.fms.util.AppConstants;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableWebFlux
@EnableSwagger2
@EnableR2dbcRepositories(basePackageClasses=EventSummaryRepository.class)
@ComponentScan(basePackages = { "io.swagger", "com.fms.api" , "com.fms.repository", "com.fms.entity","io.swagger.configuration","com.fms.config","com.fms.service"})
public class Swagger2SpringBoot implements CommandLineRunner {
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Autowired
	private EventSummaryRepository eventSummaryRepository;
	
	@Autowired 
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeEventRepository employeeEventRepository;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
	    this.resourceLoader = resourceLoader; 
	  }


    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
      //  readEventSummaryExcel();
     //  readEventExcel();
    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
    
    
    public void readEventSummaryExcel()  {
    	Resource resource = resourceLoader.getResource("file:D:\\eventSummary.xlsx");
        InputStream in;
		try {
			in = resource.getInputStream();
			 List<EventSummary> eventSummaryList = new ArrayList<EventSummary>();
			 
			  XSSFWorkbook workbook = new XSSFWorkbook(in); 
			  XSSFSheet worksheet = workbook.getSheetAt(0);
			  
			  for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) { // Test tempStudent
			  
			  XSSFRow row = worksheet.getRow(i);
			  System.out.println("val:"+row.getCell(0).getStringCellValue()); 
			  EventSummary event = new EventSummary(); 
			  event.setEventId(row.getCell(0).getStringCellValue());
			  event.setMonth(row.getCell(1).getStringCellValue());
			  event.setBaseLocation(row.getCell(2).getStringCellValue());
			  event.setBeneficiaryName(row.getCell(3).getStringCellValue());
			  event.setVenueAddress(row.getCell(4).getStringCellValue());
			  event.setCouncilName(row.getCell(5).getStringCellValue());
			  event.setProject(row.getCell(6).getStringCellValue());
			  event.setCategory(row.getCell(7).getStringCellValue());
			  event.setEventName(row.getCell(8).getStringCellValue());
			  event.setEventDescription(row.getCell(9).getStringCellValue());
			  event.setEventDate(row.getCell(10).getStringCellValue());
			  event.setTotalNoOfVolunteers((int)row.getCell(11).getNumericCellValue());
			  event.setTotalVolunteerHours((int)row.getCell(12).getNumericCellValue());
			  event.setTotalTravelHours((int)row.getCell(13).getNumericCellValue());
			  event.setOverallVolunteerHours((int)row.getCell(14).getNumericCellValue());
			  event.setLivesImpacted((int)row.getCell(15).getNumericCellValue());
			  event.setActivityType((int)row.getCell(16).getNumericCellValue());
			  event.setStatus(row.getCell(17).getStringCellValue());
			  event.setPocId((int)row.getCell(18).getNumericCellValue());
			  event.setPocName(row.getCell(19).getStringCellValue());
			  event.setPocContact((int)row.getCell(20).getNumericCellValue());
			  eventSummaryList.add(event); 
			  
			  }
			  Flux<EventSummary> eventFlux =   eventSummaryRepository.saveAll(eventSummaryList).log();
			  eventFlux.subscribe(x -> System.out.println("saved id:"+x.getEventId()));
		 //  Mono<Test> fetchedItem =	dataRepository.findByEventName("test1").log();
		//	fetchedItem.subscribe(System.out::println);
     //Mono<Test> saveItem = dataRepository.save( new Test("test2")).log();
   //    saveItem.subscribe(x -> System.out.println("saved id:"+x.getEventId()));
      //  saveItem.map((item) -> item.getEventId());
      //   System.out.println("savedId:"+saveItem.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void readEventExcel() {
    	
    	Resource resource = resourceLoader.getResource("file:D:\\event_to_emp.xlsx");
        InputStream in;
		try {
			in = resource.getInputStream();
			 List<Employee> employeeList = new ArrayList<Employee>();
			 List<EmployeeEvent> employeeEventList = new ArrayList<EmployeeEvent>();
			 
			  XSSFWorkbook workbook = new XSSFWorkbook(in); 
			  XSSFSheet worksheet = workbook.getSheetAt(0);
			  
			  for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) { // Test tempStudent
				  
				  XSSFRow row = worksheet.getRow(i);
				  System.out.println("val:"+row.getCell(0).getStringCellValue());
				 
				  EmployeeEvent empEvent = new EmployeeEvent();
				  empEvent.setEventId(row.getCell(0).getStringCellValue());
				  empEvent.setEmployeeId((int)row.getCell(7).getNumericCellValue());
				  empEvent.setType(AppConstants.PARTICIPATED);
				  employeeEventList.add(empEvent);
				  
				  Employee emp = new Employee();
				  emp.setEmployeeId((int)row.getCell(7).getNumericCellValue());
				  emp.setEmployeeName(row.getCell(8).getStringCellValue());
				  emp.setBusinessUnit(row.getCell(12).getStringCellValue());
				  employeeList.add(emp);
			  }
			  
			  Flux<Employee> employeeFlux =   employeeRepository.saveAll(employeeList).log();
			  employeeFlux.subscribe(x -> System.out.println("saved id:"+x.getEmployeeId()));
			  
			  Flux<EmployeeEvent> employeeEventFlux =   employeeEventRepository.saveAll(employeeEventList).log();
			  employeeEventFlux.subscribe(x -> System.out.println("saved employee eventid:"+x.getEventId()));
			  
		}catch(Exception ex) {
			
		}
    	
    	
    }
}
