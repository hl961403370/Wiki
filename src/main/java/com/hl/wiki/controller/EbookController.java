package com.hl.wiki.controller;

import com.hl.wiki.req.EbookReq;
import com.hl.wiki.resp.CommonResp;
import com.hl.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> commonResp = new CommonResp<List<EbookResp>> ();
        List<EbookResp> list = ebookService.list(req);
        commonResp.setContent(list);
        return commonResp;
    }
}
