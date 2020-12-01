package com.org.controller;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.service.NumberService;
import com.org.dto.Number;

@RestController
public class NumberController {
	@Autowired
	private NumberService numberService;
	
	@RequestMapping(method=RequestMethod.POST, value="/api/generate")
	@ResponseBody
	public Map<String, UUID> numGenerate(@RequestBody Number number) {
		return  Collections.singletonMap("task", numberService.addNumber(number));
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/tasks/{id}/status")
	@ResponseBody
	public Map<String, String> numStatus(@PathVariable UUID id) {
		return  Collections.singletonMap("result", numberService.getStatus(id));
	}

	@RequestMapping(method=RequestMethod.GET, value="/api/tasks/{id}")
	@ResponseBody
	public Map<String, List<String>> numList(@PathVariable UUID id) {
		return  Collections.singletonMap("result", numberService.get_numlist(id));
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/bulkGenerate")
	@ResponseBody
	public Map<String, UUID> bulkList(@RequestBody List<Number> numberList) {
		return  Collections.singletonMap("task", numberService.addNumberList(numberList));
	}

}

