package ott.j4jg_be.adapter.in.web.rest.mentoring;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ott.j4jg_be.adapter.in.web.dto.mentoring.MentoringApplicationDTO;
import ott.j4jg_be.application.port.in.mentoring.GetMentoringApplicationQuery;
import ott.j4jg_be.application.port.in.mentoring.MentoringApplicationUsecase;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MentoringApplicationController {

    private final MentoringApplicationUsecase mentoringApplicationUsecase;
    private final GetMentoringApplicationQuery mentoringApplicationQuery;

    //멘토링신청
    @PostMapping("/application")
    public void mentoringApplication(Long userId){
        mentoringApplicationUsecase.mentoringApplication(userId);
    }

    //신청 조회 -> 관리자가
    @GetMapping("/application")
    public List<MentoringApplicationDTO> getMentoringApplicationList(){
        return mentoringApplicationQuery.getApplicationList();
    }

}