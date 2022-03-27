package com.ywhhyzj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ywhhyzj
 * @date 2022/3/27 -19:28:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class marrierinfo {
    private int wedding_info;
    private String groom_name;
    private String groom_mobile;
    private String bride_name;
    private String bride_mobile;
}
