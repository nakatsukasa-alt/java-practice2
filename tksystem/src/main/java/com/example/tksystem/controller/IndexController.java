package com.example.tksystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**index画面のコントローラークラス */
@Controller
@RequestMapping("/")
public class IndexController {

	/** 
	 * index画面
	 * 
	 * @param modelモデル
	 * @return 遷移先
	 */
	@RequestMapping("index")
	public String index(Model model) {
		return "index";
	}
}
