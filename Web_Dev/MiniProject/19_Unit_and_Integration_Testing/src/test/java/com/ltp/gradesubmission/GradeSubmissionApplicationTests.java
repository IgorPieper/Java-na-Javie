package com.ltp.gradesubmission;

import com.ltp.gradesubmission.controller.GradeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//Integration Test
@SpringBootTest
@AutoConfigureMockMvc
class GradeSubmissionApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertNotNull(mockMvc);
	}

	@Test
	public void testShowGradeForm() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/?id=123");
		mockMvc.perform(request)
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("form"))
				.andExpect(model().attributeExists("grade"));
	}

	@Test
	public void testSuccessfulSubmission() throws Exception{
		RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
				.param("name", "Jan")
				.param("subject", "Math")
				.param("score", "F");

		mockMvc.perform(request)
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("/grades"));
	}

	@Test
	public void unsuccessfulSubmission() throws Exception{
		RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
				.param("name", "	")
				.param("subject", "	")
				.param("score", "R+");

			mockMvc.perform(request)
					.andExpect(status().is2xxSuccessful())
					.andExpect(view().name("form"));
	}

	@Test
	public void testGetGrades() throws Exception{
		RequestBuilder request = MockMvcRequestBuilders.get("/grades");
		mockMvc.perform(request)
				.andExpect(status().is2xxSuccessful())
				.andExpect(view().name("grades"))
				.andExpect(model().attributeExists("grades"));
	}

}
