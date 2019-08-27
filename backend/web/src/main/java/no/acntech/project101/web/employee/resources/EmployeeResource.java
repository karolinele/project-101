package no.acntech.project101.web.employee.resources;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import no.acntech.project101.employee.Employee;
import no.acntech.project101.employee.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "http://localhost:3000")
//TODO This is a REST controler and should receive request on path employees

@RestController
@RequestMapping("/employees")
public class EmployeeResource {


    List<EmployeeDto> list = new ArrayList();

    //TODO The constructor needs to accept the required dependencies and assign them to class variables
    public EmployeeResource() {

    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAll() {
        //TODO create a GET endpoint find all employees in the database and return them
        EmployeeDto employeeDto = new EmployeeDto(1l,"Ella","Kvalvik",LocalDate.of(1993,03,12), 5l);
        list.add(employeeDto);
        return ResponseEntity.ok(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable final Long id) {
        // TODO create a GET endpoint that fetches a spesific employee based on its ID
        EmployeeDto employeeById = new EmployeeDto(id,"Ella","Kvalvik",LocalDate.of(1993,03,12), 5l);
        return ResponseEntity.ok(employeeById);
    }

    @PostMapping
    public ResponseEntity createEmployee(@RequestBody final EmployeeDto newEmployee) {
        final URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(12174891274L)
                .toUri();
        return ResponseEntity.created(uri).build();
        //TODO Create a POST endpoint that accepts an employeeDTO and saves it in the database
    }

    @PostMapping("{id}")
    public ResponseEntity deleteEmployee(@PathVariable final Long id) {
        //EmployeeDto employeeToDelete = findById(id);

        list.remove(employeeToDelete);

        // TODO Create a DELETE endpoint that deletes a specific employee
        return ResponseEntity.accepted().build();
    }

    public ResponseEntity updateEmployee() {
        //TODO Create a PATCH endpoint that updates an employee with new values
        return null;
    }
}
