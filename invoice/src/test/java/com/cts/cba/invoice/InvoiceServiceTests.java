// package com.cts.cba.invoice;

// import com.cts.cba.invoice.entity.Invoice;
// import com.cts.cba.invoice.entity.Product;
// import com.cts.cba.invoice.model.Customer;
// import com.cts.cba.invoice.repository.InvoiceRepo;
// import com.cts.cba.invoice.service.InvoiceService;

// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.test.context.junit4.SpringRunner;

// @SpringBootTest
// @RunWith(SpringRunner.class)
// public class InvoiceServiceTests {

//     @Autowired
//     private InvoiceService service;

//     @MockBean
//     private InvoiceRepo repo;

//     public void invoiceUploadTests() {
        
//         Invoice invoice = new Invoice(251, "2020-01-02 10:25:00", 26.1415, 548.9715, "Debitcard",
//                 new Product(productId, productName, category, brand, description, price, stock, discount),
//                 new Customer(customerId, customerName, customerCategory, location));
//     }
// }