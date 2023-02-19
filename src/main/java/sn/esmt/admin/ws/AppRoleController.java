package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/roles")
@AllArgsConstructor
public class AppRoleController {
    private AppRoleRepository appRoleRepository;
    //insertion dans la base de donnees
    @PostMapping(path = "/save")
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }
    @GetMapping(path = "/login")
    public AppRoleEntity login(@RequestParam int id) {
        return appRoleRepository.findById(id);
    }
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }
}
