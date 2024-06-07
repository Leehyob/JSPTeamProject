package com.ott.controller.action;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {

	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;

		 if (command.equals("admin_menu")) {
			action = new AdminMenu();
		} else if (command.equals("admin_member_info")) {
			action = new AdminMemberInfoAction();
		} else if (command.equals("admin_delete_member")) {
			action = new AdminDeleteMemberAction();
		} else if (command.equals("admin_content_info")) {
			action = new AdminContentInfoAction();
		} else if (command.equals("admin_insert_content_form")) {
			action = new AdminInsertContentFormAction();
		} else if (command.equals("admin_content_detail")) {
			action = new AdminContentDetailAction();
		} else if (command.equals("admin_delete_content")) {
			action = new AdminDeleteCotentAction();
		} else if (command.equals("admin_update_content_form")) {
			action = new AdminUpdateContentFormAction();
		} else if (command.equals("admin_delete_bulletin_form")) {
			action = new AdminDeleteBulletinFormAction();
		} else if (command.equals("admin_bulletin_detail")) {
			action = new AdminBulletinDetailAction();
		} else if (command.equals("admin_delete_bulletin")) {
			action = new AdminDeleteBulletinAction();
		} else if (command.equals("qna_list")) {
			action = new QnAListFormAction();
		} else if (command.equals("qna_detail")) {
			action = new QnADetailFormAction();
		} else if (command.equals("admin_qna_reply_form")) {
			action = new AdminQnAReplyFormAction();
		} else if (command.equals("admin_qna_reply")) {
			action = new AdminQnAReplyAction();
		} else if (command.equals("update_qna_form")) {
			action = new UpdateQnAFormAction();
		} else if (command.equals("update_qna")) {
			action = new UpdateQnAAction();
		}else if (command.equals("insert_qna_form")) {
			action = new InsertQnAFormAction();
		}else if (command.equals("insert_qna")) {
			action = new InsertQnAAction();
		}else if (command.equals("member_login_form")) {
			action = new MemberLoginFormAction();
		} else if (command.equals("member_login")) {
			action = new MemberLoginAction();
		}
		return action;
	}

}
