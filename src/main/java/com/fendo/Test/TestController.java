package com.fendo.Test;

import com.fendo.model.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/datatables")
@Controller
public class TestController {

	@RequestMapping(value="/listceshi")
	@ResponseBody
	public Map<String, Object>  listjsonceshi(){
		 Map<String, Object> map = new HashMap<String, Object>();
		int count=20;
		List<Department> list=new ArrayList<Department>();
		for (int i = 1; i < 200; i++) {
			Department Department =new Department();
			Department.setId(i);
			Department.setUsername("研发"+i+"部");
			list.add(Department);
		}
		map.put("recordsTotal", count);
	    map.put("recordsFiltered", count);
	    map.put("aaData", list);
		return map;
	}

}
