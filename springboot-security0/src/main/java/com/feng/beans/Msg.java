package com.feng.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Msg {
    private String title;
    private String content;
    private String extraInfo;
}
