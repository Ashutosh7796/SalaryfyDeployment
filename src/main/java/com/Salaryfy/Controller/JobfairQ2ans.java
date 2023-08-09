package com.Salaryfy.Controller;

import com.Salaryfy.Dto.JobfairQ2ans.JobfairQ2ansDto;
import com.Salaryfy.Interfaces.IJobfairQ2ans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobFairQueAns")
public class JobfairQ2ans {

    @Autowired
    private IJobfairQ2ans iJobfairQ2ans;

    @PostMapping("/addQ2ans")
    public String addQ2ans(@RequestBody JobfairQ2ansDto jobfairQ2ansDto)
    {

        return iJobfairQ2ans.addQ2ans(jobfairQ2ansDto);
    }
    @GetMapping("/getQ2ans")
    public com.Salaryfy.Entity.JobfairQ2ans getQ2ans(@RequestParam Integer JobFairQ1AnsId)
    {

        return iJobfairQ2ans.getQ2ans(JobFairQ1AnsId);
    }
    @GetMapping("/getallQ2ans")
    public List<com.Salaryfy.Entity.JobfairQ2ans> getallQ2ans()
    {

        return iJobfairQ2ans.getallQ2ans();
    }
    @DeleteMapping("/deleteQ2ans")
    public String deleteQ2ans(@RequestParam Integer JobFairQ1AnsId)
    {

        return iJobfairQ2ans.deleteQ2ans(JobFairQ1AnsId);
    }
    @DeleteMapping("/deleteallQ2ans")
    public String deleteallQ2ans()
    {
        iJobfairQ2ans.deleteallQ2ans();

        return "All data deleted";
    }


}