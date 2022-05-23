package com.project.lowcode.content.decipher.domain.models.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackendDto {
    @NotNull
    private String name;
    private List<EntityDto> entity;
}
