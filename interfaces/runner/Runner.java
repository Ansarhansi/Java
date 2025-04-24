import com.ansar.interfaces.external.*;
import com.ansar.interfaces.internal.*;

public class Runner {
    public static void main(String[] args) {

        // Interface reference
        LoginService login1 = new LoginServiceImpl();
        login1.login();

        // Class reference
        LoginServiceImpl login2 = new LoginServiceImpl();
        login2.login();

        PaymentService payment1 = new PaymentServiceImpl();
        payment1.processPayment();
        PaymentServiceImpl payment2 = new PaymentServiceImpl();
        payment2.processPayment();

        NotificationService notify1 = new NotificationServiceImpl();
        notify1.sendNotification();
        NotificationServiceImpl notify2 = new NotificationServiceImpl();
        notify2.sendNotification();

        ReportService report1 = new ReportServiceImpl();
        report1.generateReport();
        ReportServiceImpl report2 = new ReportServiceImpl();
        report2.generateReport();

        FeedbackService feedback1 = new FeedbackServiceImpl();
        feedback1.collectFeedback();
        FeedbackServiceImpl feedback2 = new FeedbackServiceImpl();
        feedback2.collectFeedback();

//3 methods class

        UserService user1 = new UserServiceImpl();
        user1.registerUser();
        user1.updateUser();
        user1.deleteUser();

        UserServiceImpl user2 = new UserServiceImpl();
        user2.registerUser();
        user2.updateUser();
        user2.deleteUser();

        // OrderService
        OrderService order1 = new OrderServiceImpl();
        order1.createOrder();
        order1.updateOrder();
        order1.cancelOrder();

        OrderServiceImpl order2 = new OrderServiceImpl();
        order2.createOrder();
        order2.updateOrder();
        order2.cancelOrder();

        // InventoryService
        InventoryService inventory1 = new InventoryServiceImpl();
        inventory1.addItem();
        inventory1.updateItem();
        inventory1.removeItem();

        InventoryServiceImpl inventory2 = new InventoryServiceImpl();
        inventory2.addItem();
        inventory2.updateItem();
        inventory2.removeItem();

        // EmailService
        EmailService email1 = new EmailServiceImpl();
        email1.composeEmail();
        email1.sendEmail();
        email1.deleteEmail();

        EmailServiceImpl email2 = new EmailServiceImpl();
        email2.composeEmail();
        email2.sendEmail();
        email2.deleteEmail();

        // ReviewService
        ReviewService review1 = new ReviewServiceImpl();
        review1.writeReview();
        review1.editReview();
        review1.deleteReview();

        ReviewServiceImpl review2 = new ReviewServiceImpl();
        review2.writeReview();
        review2.editReview();
        review2.deleteReview();


        //5 methods

        UserAuthentication userAuth = new UserAuthenticationImpl();
        OrderManagement orderManagement = new OrderManagementImpl();
        InventorySystem inventorySystem = new InventorySystemImpl();
        CustomerSupport customerSupport = new CustomerSupportImpl();
        LearningManagement learningManagement = new LearningManagementImpl();

        // Using implementation class as reference
        UserAuthenticationImpl userAuthImpl = new UserAuthenticationImpl();
        OrderManagementImpl orderManagementImpl = new OrderManagementImpl();
        InventorySystemImpl inventorySystemImpl = new InventorySystemImpl();
        CustomerSupportImpl customerSupportImpl = new CustomerSupportImpl();
        LearningManagementImpl learningManagementImpl = new LearningManagementImpl();

        // ------------------ UserAuthentication Interface ---------------------
        System.out.println("\nUser Authentication Interface:");
        userAuth.registerUser();
        userAuth.loginUser();
        userAuth.logoutUser();
        userAuth.resetPassword();
        userAuth.changePassword();
        userAuth.verifyEmail();
        userAuth.resendVerificationEmail();

        // Using Implementation Class
        System.out.println("\nUser Authentication Impl:");
        userAuthImpl.registerUser();
        userAuthImpl.loginUser();
        userAuthImpl.logoutUser();
        userAuthImpl.resetPassword();
        userAuthImpl.changePassword();
        userAuthImpl.verifyEmail();
        userAuthImpl.resendVerificationEmail();

        // ------------------ OrderManagement Interface ---------------------
        System.out.println("\nOrder Management Interface:");
        orderManagement.createOrder();
        orderManagement.updateOrder();
        orderManagement.deleteOrder();
        orderManagement.viewOrder();
        orderManagement.processOrder();
        orderManagement.cancelOrder();
        orderManagement.generateInvoice();

        // Using Implementation Class
        System.out.println("\nOrder Management Impl:");
        orderManagementImpl.createOrder();
        orderManagementImpl.updateOrder();
        orderManagementImpl.deleteOrder();
        orderManagementImpl.viewOrder();
        orderManagementImpl.processOrder();
        orderManagementImpl.cancelOrder();
        orderManagementImpl.generateInvoice();

        // ------------------ InventorySystem Interface ---------------------
        System.out.println("\nInventory System Interface:");
        inventorySystem.addItem();
        inventorySystem.removeItem();
        inventorySystem.updateItem();
        inventorySystem.viewItem();
        inventorySystem.checkStock();
        inventorySystem.reorderItem();
        inventorySystem.generateStockReport();

        // Using Implementation Class
        System.out.println("\nInventory System Impl:");
        inventorySystemImpl.addItem();
        inventorySystemImpl.removeItem();
        inventorySystemImpl.updateItem();
        inventorySystemImpl.viewItem();
        inventorySystemImpl.checkStock();
        inventorySystemImpl.reorderItem();
        inventorySystemImpl.generateStockReport();

        // ------------------ CustomerSupport Interface ---------------------
        System.out.println("\nCustomer Support Interface:");
        customerSupport.raiseTicket();
        customerSupport.assignTicket();
        customerSupport.updateTicket();
        customerSupport.closeTicket();
        customerSupport.reopenTicket();
        customerSupport.viewTicketHistory();
        customerSupport.escalateTicket();

        // Using Implementation Class
        System.out.println("\nCustomer Support Impl:");
        customerSupportImpl.raiseTicket();
        customerSupportImpl.assignTicket();
        customerSupportImpl.updateTicket();
        customerSupportImpl.closeTicket();
        customerSupportImpl.reopenTicket();
        customerSupportImpl.viewTicketHistory();
        customerSupportImpl.escalateTicket();

        // ------------------ LearningManagement Interface ---------------------
        System.out.println("\nLearning Management Interface:");
        learningManagement.enrollCourse();
        learningManagement.startCourse();
        learningManagement.completeCourse();
        learningManagement.giveQuiz();
        learningManagement.viewProgress();
        learningManagement.getCertificate();
        learningManagement.provideFeedback();

        // Using Implementation Class
        System.out.println("\nLearning Management Impl:");
        learningManagementImpl.enrollCourse();
        learningManagementImpl.startCourse();
        learningManagementImpl.completeCourse();
        learningManagementImpl.giveQuiz();
        learningManagementImpl.viewProgress();
        learningManagementImpl.getCertificate();
        learningManagementImpl.provideFeedback();

        //7 methods

        ProductManagementSystem productManagementSystem = new ProductManagementSystemImpl();
        productManagementSystem.addNewProduct();
        productManagementSystem.removeProduct();
        productManagementSystem.updateProductDetails();
        productManagementSystem.viewProduct();
        productManagementSystem.checkProductAvailability();
        productManagementSystem.restockProduct();
        productManagementSystem.generateProductReport();

        CustomerSupportSystem customerSupportSystem = new CustomerSupportSystemImpl();
        customerSupportSystem.createSupportTicket();
        customerSupportSystem.resolveTicket();
        customerSupportSystem.trackTicketStatus();
        customerSupportSystem.provideSupportChat();
        customerSupportSystem.escalateIssue();
        customerSupportSystem.closeTicket();
        customerSupportSystem.generateSupportReport();

        SalesTrackingSystem salesTrackingSystem = new SalesTrackingSystemImpl();
        salesTrackingSystem.recordSale();
        salesTrackingSystem.updateSale();
        salesTrackingSystem.cancelSale();
        salesTrackingSystem.viewSalesReport();
        salesTrackingSystem.calculateSalesCommission();
        salesTrackingSystem.trackRevenue();
        salesTrackingSystem.analyzeSalesTrends();

        InventoryTrackingSystem inventoryTrackingSystem = new InventoryTrackingSystemImpl();
        inventoryTrackingSystem.trackInventoryLevel();
        inventoryTrackingSystem.updateInventory();
        inventoryTrackingSystem.generateInventoryReport();
        inventoryTrackingSystem.setReorderThreshold();
        inventoryTrackingSystem.checkExpirationDate();
        inventoryTrackingSystem.transferInventory();
        inventoryTrackingSystem.performInventoryAudit();

        SupplierManagementSystem supplierManagementSystem = new SupplierManagementSystemImpl();
        supplierManagementSystem.addNewSupplier();
        supplierManagementSystem.updateSupplierDetails();
        supplierManagementSystem.removeSupplier();
        supplierManagementSystem.trackSupplierPerformance();
        supplierManagementSystem.processSupplierPayment();
        supplierManagementSystem.viewSupplierHistory();
        supplierManagementSystem.generateSupplierReport();


        // Using Implementation Class as Type
        System.out.println("\nUsing Implementation Class as Type:");

        ProductManagementSystemImpl productManagementSystemImpl = new ProductManagementSystemImpl();
        productManagementSystemImpl.addNewProduct();
        productManagementSystemImpl.removeProduct();
        productManagementSystemImpl.updateProductDetails();
        productManagementSystemImpl.viewProduct();
        productManagementSystemImpl.checkProductAvailability();
        productManagementSystemImpl.restockProduct();
        productManagementSystemImpl.generateProductReport();

        CustomerSupportSystemImpl customerSupportSystemImpl = new CustomerSupportSystemImpl();
        customerSupportSystemImpl.createSupportTicket();
        customerSupportSystemImpl.resolveTicket();
        customerSupportSystemImpl.trackTicketStatus();
        customerSupportSystemImpl.provideSupportChat();
        customerSupportSystemImpl.escalateIssue();
        customerSupportSystemImpl.closeTicket();
        customerSupportSystemImpl.generateSupportReport();

        SalesTrackingSystemImpl salesTrackingSystemImpl = new SalesTrackingSystemImpl();
        salesTrackingSystemImpl.recordSale();
        salesTrackingSystemImpl.updateSale();
        salesTrackingSystemImpl.cancelSale();
        salesTrackingSystemImpl.viewSalesReport();
        salesTrackingSystemImpl.calculateSalesCommission();
        salesTrackingSystemImpl.trackRevenue();
        salesTrackingSystemImpl.analyzeSalesTrends();

        InventoryTrackingSystemImpl inventoryTrackingSystemImpl = new InventoryTrackingSystemImpl();
        inventoryTrackingSystemImpl.trackInventoryLevel();
        inventoryTrackingSystemImpl.updateInventory();
        inventoryTrackingSystemImpl.generateInventoryReport();
        inventoryTrackingSystemImpl.setReorderThreshold();
        inventoryTrackingSystemImpl.checkExpirationDate();
        inventoryTrackingSystemImpl.transferInventory();
        inventoryTrackingSystemImpl.performInventoryAudit();

        SupplierManagementSystemImpl supplierManagementSystemImpl = new SupplierManagementSystemImpl();
        supplierManagementSystemImpl.addNewSupplier();
        supplierManagementSystemImpl.updateSupplierDetails();
        supplierManagementSystemImpl.removeSupplier();
        supplierManagementSystemImpl.trackSupplierPerformance();
        supplierManagementSystemImpl.processSupplierPayment();
        supplierManagementSystemImpl.viewSupplierHistory();
        supplierManagementSystemImpl.generateSupplierReport();

        // 9 methods

        OrderProcessingSystem orderProcessingSystem = new OrderProcessingSystemImpl();
        orderProcessingSystem.placeOrder();
        orderProcessingSystem.cancelOrder();
        orderProcessingSystem.trackOrder();
        orderProcessingSystem.updateOrder();
        orderProcessingSystem.applyDiscount();
        orderProcessingSystem.processPayment();
        orderProcessingSystem.refundOrder();
        orderProcessingSystem.generateInvoice();
        orderProcessingSystem.confirmDelivery();

        CustomerFeedbackSystem customerFeedbackSystem = new CustomerFeedbackSystemImpl();
        customerFeedbackSystem.collectFeedback();
        customerFeedbackSystem.analyzeFeedback();
        customerFeedbackSystem.respondToFeedback();
        customerFeedbackSystem.escalateFeedback();
        customerFeedbackSystem.closeFeedbackTicket();
        customerFeedbackSystem.generateFeedbackReport();
        customerFeedbackSystem.notifyCustomer();
        customerFeedbackSystem.trackCustomerSatisfaction();
        customerFeedbackSystem.recommendImprovements();

        ShippingSystem shippingSystem = new ShippingSystemImpl();
        shippingSystem.scheduleShipment();
        shippingSystem.trackShipment();
        shippingSystem.updateShipmentStatus();
        shippingSystem.calculateShippingCost();
        shippingSystem.processReturn();
        shippingSystem.packageItem();
        shippingSystem.dispatchShipment();
        shippingSystem.generateShippingLabel();
        shippingSystem.confirmShipment();

        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystemImpl();
        employeeManagementSystem.addEmployee();
        employeeManagementSystem.removeEmployee();
        employeeManagementSystem.updateEmployeeDetails();
        employeeManagementSystem.viewEmployeeDetails();
        employeeManagementSystem.calculateSalary();
        employeeManagementSystem.processPayroll();
        employeeManagementSystem.assignTask();
        employeeManagementSystem.generateEmployeeReport();
        employeeManagementSystem.promoteEmployee();

        InventoryAuditSystem inventoryAuditSystem = new InventoryAuditSystemImpl();
        inventoryAuditSystem.startInventoryAudit();
        inventoryAuditSystem.logAuditDetails();
        inventoryAuditSystem.reconcileInventory();
        inventoryAuditSystem.verifyStockLevels();
        inventoryAuditSystem.checkInventoryDiscrepancies();
        inventoryAuditSystem.generateAuditReport();
        inventoryAuditSystem.analyzeAuditResults();
        inventoryAuditSystem.updateInventoryRecords();
        inventoryAuditSystem.closeInventoryAudit();
    }
}




