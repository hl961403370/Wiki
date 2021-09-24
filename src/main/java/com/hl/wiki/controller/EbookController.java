package com.hl.wiki.controller;

import com.hl.wiki.domain.Ebook;
import com.hl.wiki.resp.CommonResp;
import com.hl.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Ebook>> commonResp = new CommonResp<List<Ebook>> ();
        List<Ebook> list = ebookService.list();
        commonResp.setContent(list);
        return commonResp;
    }
}
