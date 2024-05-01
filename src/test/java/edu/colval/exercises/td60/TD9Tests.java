//package edu.colval.exercises.td60;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class TD9Tests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testNullPointerException() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/testNullPointerException"))
//                .andExpect(status().isInternalServerError());
//    }
//
//    @Test
//    public void testException() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/testException"))
//                .andExpect(status().isInternalServerError());
//    }
//}