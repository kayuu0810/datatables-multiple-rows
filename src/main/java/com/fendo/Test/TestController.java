package com.fendo.Test;

import com.fendo.model.Ceshi;
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
		List<Ceshi> list=new ArrayList<Ceshi>();
		for (int i = 1; i < 200; i++) {
			Ceshi ceshi=new Ceshi();
			ceshi.setId(i);
			ceshi.setUsername("研发"+i+"部");
			list.add(ceshi);
		}
		map.put("recordsTotal", count);
	    map.put("recordsFiltered", count);
	    map.put("aaData", list);
		return map;
	}

}
