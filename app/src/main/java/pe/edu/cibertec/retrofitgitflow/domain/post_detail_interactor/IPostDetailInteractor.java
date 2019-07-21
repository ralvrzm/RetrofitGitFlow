package pe.edu.cibertec.retrofitgitflow.domain.post_detail_interactor;

import org.w3c.dom.Comment;

import java.util.List;

import pe.edu.cibertec.retrofitgitflow.data.entities.Post;
import pe.edu.cibertec.retrofitgitflow.domain.main_interactor.IMainInteractor;

public interface IPostDetailInteractor {

    interface IPostDetailCallBack{
        void onSuccess(Post post);
        void onError(String errorMsg);
    }
    void getPost(int postId, IPostDetailCallBack callBack);

    /*
    interface PostDetailCommentCallBack{
        void onSuccess(List<Comment> comments);
        void onError(String errorMsg);
    }

    void getCommentsOfPost(int postId, PostDetailComment);
    */
}
