package com.example.demo.design.proxy.image.impl;

import com.example.demo.design.proxy.image.Image;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yao
 * @date 2019/12/8
 */
@Slf4j
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        log.info("Displaying {}", fileName);
    }

    private void loadFromDisk(String fileName) {
        log.info("Loading {}", fileName);
    }
}
