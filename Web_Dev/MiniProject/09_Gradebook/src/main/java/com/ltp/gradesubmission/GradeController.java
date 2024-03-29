package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GradeController {

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/grades")
    public String GetGrade(Model model){
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    @GetMapping("/")
    public String GetForm(Model model, @RequestParam(required = false) String id){
        Grade grade;
        if (getGradeIndex(id)==Constants.NOT_FOUND){
            grade = new Grade();
        } else{
            grade = studentGrades.get(getGradeIndex(id));
        }
        model.addAttribute("grade", grade);
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade){
        int index = getGradeIndex(grade.getId());
        if (index == Constants.NOT_FOUND) {
            studentGrades.add(grade);
        } else{
            studentGrades.set(index, grade);
        }
        return "redirect:/grades";
    }

    public Integer getGradeIndex(String id){
        for (int i = 0; i < studentGrades.size(); i++){
            if (studentGrades.get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }
}
