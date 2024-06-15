/* Sequence 저장테이블 */
CREATE TABLE COMTECOPSEQ
(
	TABLE_NAME            VARCHAR2(20)  NOT NULL ,
	NEXT_ID               NUMBER(30)  NULL ,
CONSTRAINT  COMTECOPSEQ_PK PRIMARY KEY (TABLE_NAME)
);




/* 공통분류코드 */
CREATE TABLE COMTCCMMNCLCODE
(
	CL_CODE               CHAR(3)  NOT NULL ,
	CL_CODE_NM            VARCHAR2(60)  NULL ,
	CL_CODE_DC            VARCHAR2(200)  NULL ,
	USE_AT                CHAR(1)  NULL ,
	FRST_REGIST_PNTTM     DATE  NULL ,
	FRST_REGISTER_ID      VARCHAR2(20)  NULL ,
	LAST_UPDT_PNTTM       DATE  NULL ,
	LAST_UPDUSR_ID        VARCHAR2(20)  NULL ,
CONSTRAINT  COMTCCMMNCLCODE_PK PRIMARY KEY (CL_CODE)
);




/* 공통코드 */
CREATE TABLE COMTCCMMNCODE
(
	CODE_ID               VARCHAR2(6)  NOT NULL ,
	CODE_ID_NM            VARCHAR2(60)  NULL ,
	CODE_ID_DC            VARCHAR2(200)  NULL ,
	USE_AT                CHAR(1)  NULL ,
	CL_CODE               CHAR(3)  NULL ,
	FRST_REGIST_PNTTM     DATE  NULL ,
	FRST_REGISTER_ID      VARCHAR2(20)  NULL ,
	LAST_UPDT_PNTTM       DATE  NULL ,
	LAST_UPDUSR_ID        VARCHAR2(20)  NULL ,
CONSTRAINT  COMTCCMMNCODE_PK PRIMARY KEY (CODE_ID),
CONSTRAINT  COMTCCMMNCODE_FK1 FOREIGN KEY (CL_CODE) REFERENCES COMTCCMMNCLCODE(CL_CODE) ON DELETE SET NULL
);

CREATE INDEX COMTCCMMNCODE_i01 ON COMTCCMMNCODE
(CL_CODE  ASC);



/* 공통상세코드 */
CREATE TABLE COMTCCMMNDETAILCODE
(
	CODE_ID               VARCHAR2(6)  NOT NULL ,
	CODE                  VARCHAR2(15)  NOT NULL ,
	CODE_NM               VARCHAR2(60)  NULL ,
	CODE_DC               VARCHAR2(200)  NULL ,
	USE_AT                CHAR(1)  NULL ,
	FRST_REGIST_PNTTM     DATE  NULL ,
	FRST_REGISTER_ID      VARCHAR2(20)  NULL ,
	LAST_UPDT_PNTTM       DATE  NULL ,
	LAST_UPDUSR_ID        VARCHAR2(20)  NULL ,
CONSTRAINT  COMTCCMMNDETAILCODE_PK PRIMARY KEY (CODE_ID,CODE),
CONSTRAINT  COMTCCMMNDETAILCODE_FK1 FOREIGN KEY (CODE_ID) REFERENCES COMTCCMMNCODE(CODE_ID)
);

CREATE INDEX COMTCCMMNDETAILCODE_i01 ON COMTCCMMNDETAILCODE
(CODE_ID  ASC);



/* 권한그룹정보 */
CREATE TABLE COMTNAUTHORGROUPINFO
(
	GROUP_ID              CHAR(20)  NOT NULL ,
	GROUP_NM              VARCHAR2(60)  NOT NULL ,
	GROUP_CREAT_DE        CHAR(20)  NOT NULL ,
	GROUP_DC              VARCHAR2(100)  NULL ,
CONSTRAINT  COMTNAUTHORGROUPINFO_PK PRIMARY KEY (GROUP_ID)
);




/* 조직정보 */
CREATE TABLE COMTNORGNZTINFO
(
	ORGNZT_ID             CHAR(20)  NOT NULL ,
	ORGNZT_NM             VARCHAR2(20)  NOT NULL ,
	ORGNZT_DC             VARCHAR2(100)  NULL ,
CONSTRAINT  COMTNORGNZTINFO_PK PRIMARY KEY (ORGNZT_ID)
);




/* 파일속성 */
CREATE TABLE COMTNFILE
(
	ATCH_FILE_ID          CHAR(20)  NOT NULL ,
	CREAT_DT              DATE  NOT NULL ,
	USE_AT                CHAR(1)  NULL ,
CONSTRAINT  COMTNFILE_PK PRIMARY KEY (ATCH_FILE_ID)
);




/* 파일상세정보 */
CREATE TABLE COMTNFILEDETAIL
(
	ATCH_FILE_ID          CHAR(20)  NOT NULL ,
	FILE_SN               NUMBER(10)  NOT NULL ,
	FILE_STRE_COURS       VARCHAR2(2000)  NOT NULL ,
	STRE_FILE_NM          VARCHAR2(255)  NOT NULL ,
	ORIGNL_FILE_NM        VARCHAR2(255)  NULL ,
	FILE_EXTSN            VARCHAR2(20)  NOT NULL ,
	FILE_CN               CLOB  NULL ,
	FILE_SIZE             NUMBER(8)  NULL ,
CONSTRAINT  COMTNFILEDETAIL_PK PRIMARY KEY (ATCH_FILE_ID,FILE_SN),
CONSTRAINT  COMTNFILEDETAIL_FK1 FOREIGN KEY (ATCH_FILE_ID) REFERENCES COMTNFILE(ATCH_FILE_ID)
);

CREATE INDEX COMTNFILEDETAIL_i01 ON COMTNFILEDETAIL
(ATCH_FILE_ID  ASC);



/* 메일발신관리 */
CREATE TABLE COMTHEMAILDSPTCHMANAGE
(
	MSSAGE_ID             VARCHAR2(20)  NOT NULL ,
	EMAIL_CN              CLOB  NULL ,
	SNDR                  VARCHAR2(50)  NOT NULL ,
	RCVER                 VARCHAR2(50)  NOT NULL ,
	SJ                    VARCHAR2(60)  NOT NULL ,
	SNDNG_RESULT_CODE     CHAR(1)  NULL ,
	DSPTCH_DT             CHAR(20)  NOT NULL ,
	ATCH_FILE_ID          CHAR(20)  NULL ,
CONSTRAINT  COMTHEMAILDSPTCHMANAGE_PK PRIMARY KEY (MSSAGE_ID),
CONSTRAINT  COMTHEMAILDSPTCHMANAGE_FK1 FOREIGN KEY (ATCH_FILE_ID) REFERENCES COMTNFILE(ATCH_FILE_ID) ON DELETE SET NULL
);

CREATE INDEX COMTHEMAILDSPTCHMANAGE_i01 ON COMTHEMAILDSPTCHMANAGE
(SNDR  ASC);
CREATE INDEX COMTHEMAILDSPTCHMANAGE_i02 ON COMTHEMAILDSPTCHMANAGE
(ATCH_FILE_ID  ASC);



/* 일반회원 */
CREATE TABLE COMTNGNRLMBER
(
	MBER_ID               VARCHAR2(20)  NOT NULL ,
	PASSWORD              VARCHAR2(200)  NOT NULL ,
	PASSWORD_HINT         VARCHAR2(100)  NULL ,
	PASSWORD_CNSR         VARCHAR2(100)  NULL ,
	IHIDNUM               VARCHAR2(200)  NULL ,
	MBER_NM               VARCHAR2(50)  NOT NULL ,
	ZIP                   VARCHAR2(6)  NOT NULL ,
	ADRES                 VARCHAR2(100)  NOT NULL ,
	AREA_NO               VARCHAR2(4)  NOT NULL ,
	MBER_STTUS            VARCHAR2(15)  NULL ,
	DETAIL_ADRES          VARCHAR2(100)  NULL ,
	END_TELNO             VARCHAR2(4)  NOT NULL ,
	MBTLNUM               VARCHAR2(20)  NOT NULL ,
	GROUP_ID              CHAR(20)  NULL ,
	MBER_FXNUM            VARCHAR2(20)  NULL ,
	MBER_EMAIL_ADRES      VARCHAR2(50)  NULL ,
	MIDDLE_TELNO          VARCHAR2(4)  NOT NULL ,
	SBSCRB_DE             DATE  NULL ,
	SEXDSTN_CODE          CHAR(1)  NULL ,
	ESNTL_ID              CHAR(20)  NOT NULL ,
	LOCK_AT               CHAR(1) NULL,
	LOCK_CNT              NUMBER(3) NULL,
	LOCK_LAST_PNTTM       DATE NULL,
CONSTRAINT  COMTNGNRLMBER_PK PRIMARY KEY (MBER_ID),
CONSTRAINT  COMTNGNRLMBER_FK1 FOREIGN KEY (GROUP_ID) REFERENCES COMTNAUTHORGROUPINFO(GROUP_ID) ON DELETE CASCADE
);

CREATE INDEX COMTNGNRLMBER_i01 ON COMTNGNRLMBER
(GROUP_ID  ASC);



/* 업무사용자정보 */
CREATE TABLE COMTNEMPLYRINFO
(
	EMPLYR_ID             VARCHAR2(20)  NOT NULL ,
	ORGNZT_ID             CHAR(20)  NULL ,
	USER_NM               VARCHAR2(60)  NOT NULL ,
	PASSWORD              VARCHAR2(200)  NOT NULL ,
	EMPL_NO               VARCHAR2(20)  NULL ,
	IHIDNUM               VARCHAR2(200)  NULL ,
	SEXDSTN_CODE          CHAR(1)  NULL ,
	BRTHDY                CHAR(20)  NULL ,
	FXNUM                 VARCHAR2(20)  NULL ,
	HOUSE_ADRES           VARCHAR2(100)  NOT NULL ,
	PASSWORD_HINT         VARCHAR2(100)  NOT NULL ,
	PASSWORD_CNSR         VARCHAR2(100)  NOT NULL ,
	HOUSE_END_TELNO       VARCHAR2(4)  NOT NULL ,
	AREA_NO               VARCHAR2(4)  NOT NULL ,
	DETAIL_ADRES          VARCHAR2(100)  NULL ,
	ZIP                   VARCHAR2(6)  NOT NULL ,
	OFFM_TELNO            VARCHAR2(20)  NULL ,
	MBTLNUM               VARCHAR2(20)  NULL ,
	EMAIL_ADRES           VARCHAR2(50)  NULL ,
	OFCPS_NM              VARCHAR2(60)  NULL ,
	HOUSE_MIDDLE_TELNO    VARCHAR2(4)  NOT NULL ,
	GROUP_ID              CHAR(20)  NULL ,
	PSTINST_CODE          CHAR(8)  NULL ,
	EMPLYR_STTUS_CODE     CHAR(1)  NOT NULL ,
	ESNTL_ID              CHAR(20)  NOT NULL ,
	CRTFC_DN_VALUE        VARCHAR2(100)  NULL ,
	SBSCRB_DE             DATE  NULL ,
	LOCK_AT               CHAR(1) NULL,
	LOCK_CNT              NUMBER(3) NULL,
	LOCK_LAST_PNTTM       DATE NULL,
CONSTRAINT  COMTNEMPLYRINFO_PK PRIMARY KEY (EMPLYR_ID),
CONSTRAINT  COMTNEMPLYRINFO_FK2 FOREIGN KEY (ORGNZT_ID) REFERENCES COMTNORGNZTINFO(ORGNZT_ID) ON DELETE CASCADE,
CONSTRAINT  COMTNEMPLYRINFO_FK1 FOREIGN KEY (GROUP_ID) REFERENCES COMTNAUTHORGROUPINFO(GROUP_ID) ON DELETE CASCADE
);

CREATE INDEX COMTNEMPLYRINFO_i01 ON COMTNEMPLYRINFO
(ORGNZT_ID  ASC);
CREATE INDEX COMTNEMPLYRINFO_i02 ON COMTNEMPLYRINFO
(GROUP_ID  ASC);



/* 기업회원 */
CREATE TABLE COMTNENTRPRSMBER
(
	ENTRPRS_MBER_ID       VARCHAR2(20)  NOT NULL ,
	ENTRPRS_SE_CODE       CHAR(8)  NULL ,
	BIZRNO                VARCHAR2(10)  NULL ,
	JURIRNO               VARCHAR2(13)  NULL ,
	CMPNY_NM              VARCHAR2(60)  NOT NULL ,
	CXFC                  VARCHAR2(50)  NULL ,
	ZIP                   VARCHAR2(6)  NOT NULL ,
	ADRES                 VARCHAR2(100)  NOT NULL ,
	ENTRPRS_MIDDLE_TELNO  VARCHAR2(4)  NOT NULL ,
	FXNUM                 VARCHAR2(20)  NULL ,
	INDUTY_CODE           CHAR(1)  NULL ,
	APPLCNT_NM            VARCHAR2(50)  NOT NULL ,
	APPLCNT_IHIDNUM       VARCHAR2(200)  NULL ,
	SBSCRB_DE             DATE  NULL ,
	ENTRPRS_MBER_STTUS    VARCHAR2(15)  NULL ,
	ENTRPRS_MBER_PASSWORD  VARCHAR2(200)  NULL ,
	ENTRPRS_MBER_PASSWORD_HINT  VARCHAR2(100)  NOT NULL ,
	ENTRPRS_MBER_PASSWORD_CNSR  VARCHAR2(100)  NOT NULL ,
	GROUP_ID              CHAR(20)  NULL ,
	DETAIL_ADRES          VARCHAR2(100)  NULL ,
	ENTRPRS_END_TELNO     VARCHAR2(4)  NOT NULL ,
	AREA_NO               VARCHAR2(4)  NOT NULL ,
	APPLCNT_EMAIL_ADRES   VARCHAR2(50)  NOT NULL ,
	ESNTL_ID              CHAR(20)  NOT NULL ,
	LOCK_AT               CHAR(1) NULL,
	LOCK_CNT              NUMBER(3) NULL,
	LOCK_LAST_PNTTM       DATE NULL,
CONSTRAINT  COMTNENTRPRSMBER_PK PRIMARY KEY (ENTRPRS_MBER_ID),
CONSTRAINT  COMTNENTRPRSMBER_FK1 FOREIGN KEY (GROUP_ID) REFERENCES COMTNAUTHORGROUPINFO(GROUP_ID) ON DELETE CASCADE
);

CREATE INDEX COMTNENTRPRSMBER_i01 ON COMTNENTRPRSMBER
(GROUP_ID  ASC);



/* 권한정보 */
CREATE TABLE COMTNAUTHORINFO
(
	AUTHOR_CODE           VARCHAR2(30)  NOT NULL ,
	AUTHOR_NM             VARCHAR2(60)  NOT NULL ,
	AUTHOR_DC             VARCHAR2(200)  NULL ,
	AUTHOR_CREAT_DE       CHAR(20)  NOT NULL ,
CONSTRAINT  COMTNAUTHORINFO_PK PRIMARY KEY (AUTHOR_CODE)
);




/* 롤 계층구조 */
CREATE TABLE COMTNROLES_HIERARCHY
(
	PARNTS_ROLE           VARCHAR2(30)  NOT NULL ,
	CHLDRN_ROLE           VARCHAR2(30)  NOT NULL ,
CONSTRAINT  COMTNROLES_HIERARCHY_PK PRIMARY KEY (PARNTS_ROLE,CHLDRN_ROLE),
CONSTRAINT  COMTNROLES_HIERARCHY_FK1 FOREIGN KEY (PARNTS_ROLE) REFERENCES COMTNAUTHORINFO(AUTHOR_CODE) ON DELETE CASCADE,
CONSTRAINT  COMTNROLES_HIERARCHY_FK2 FOREIGN KEY (CHLDRN_ROLE) REFERENCES COMTNAUTHORINFO(AUTHOR_CODE) ON DELETE CASCADE
);

CREATE UNIQUE INDEX COMTNROLES_HIERARCHY_i01 ON COMTNROLES_HIERARCHY
(PARNTS_ROLE  ASC);
CREATE INDEX COMTNROLES_HIERARCHY_i02 ON COMTNROLES_HIERARCHY
(CHLDRN_ROLE  ASC);



/* 롤정보 */
CREATE TABLE COMTNROLEINFO
(
	ROLE_CODE             VARCHAR2(50)  NOT NULL ,
	ROLE_NM               VARCHAR2(60)  NOT NULL ,
	ROLE_PTTRN            VARCHAR2(300)  NULL ,
	ROLE_DC               VARCHAR2(200)  NULL ,
	ROLE_TY               VARCHAR2(80)  NULL ,
	ROLE_SORT             VARCHAR2(10)  NULL ,
	ROLE_CREAT_DE         CHAR(20)  NOT NULL ,
CONSTRAINT  COMTNROLEINFO_PK PRIMARY KEY (ROLE_CODE)
);




/* 권한롤관계 */
CREATE TABLE COMTNAUTHORROLERELATE
(
	AUTHOR_CODE           VARCHAR2(30)  NOT NULL ,
	ROLE_CODE             VARCHAR2(50)  NOT NULL ,
	CREAT_DT              DATE  NULL ,
CONSTRAINT  COMTNAUTHORROLERELATE_PK PRIMARY KEY (AUTHOR_CODE,ROLE_CODE),
CONSTRAINT  COMTNAUTHORROLERELATE_FK1 FOREIGN KEY (AUTHOR_CODE) REFERENCES COMTNAUTHORINFO(AUTHOR_CODE) ON DELETE CASCADE,
CONSTRAINT  COMTNAUTHORROLERELATE_FK2 FOREIGN KEY (ROLE_CODE) REFERENCES COMTNROLEINFO(ROLE_CODE) ON DELETE CASCADE
);

CREATE INDEX COMTNAUTHORROLERELATE_i01 ON COMTNAUTHORROLERELATE
(AUTHOR_CODE  ASC);
CREATE INDEX COMTNAUTHORROLERELATE_i02 ON COMTNAUTHORROLERELATE
(ROLE_CODE  ASC);



/* IDS */
CREATE TABLE IDS
(
	IDGEN_TABLE_NM        VARCHAR2(20)  NOT NULL ,
	IDGEN_NEXT_ID         NUMBER(30)  NOT NULL ,
CONSTRAINT  IDS_PK PRIMARY KEY (IDGEN_TABLE_NM)
);




/* 사용자정보뷰 */
CREATE  VIEW COMVNUSERMASTER ( ESNTL_ID,USER_ID,PASSWORD,USER_NM,USER_ZIP,USER_ADRES,USER_EMAIL,GROUP_ID, USER_SE, ORGNZT_ID ) 
AS  SELECT ESNTL_ID, MBER_ID,PASSWORD,MBER_NM,ZIP,ADRES,MBER_EMAIL_ADRES,' ','GNR' AS USER_SE, ' ' ORGNZT_ID
		FROM COMTNGNRLMBER
	UNION ALL
		SELECT ESNTL_ID,EMPLYR_ID,PASSWORD,USER_NM,ZIP,HOUSE_ADRES,EMAIL_ADRES,GROUP_ID ,'USR' AS USER_SE, ORGNZT_ID
		FROM COMTNEMPLYRINFO
	UNION ALL
		SELECT ESNTL_ID,ENTRPRS_MBER_ID,ENTRPRS_MBER_PASSWORD,CMPNY_NM,ZIP,ADRES,APPLCNT_EMAIL_ADRES,' ' ,'ENT' AS USER_SE, ' ' ORGNZT_ID
		FROM COMTNENTRPRSMBER ORDER BY ESNTL_ID;


/* 사용자부재 */
CREATE TABLE COMTNUSERABSNCE
(
	EMPLYR_ID             VARCHAR2(20)  NOT NULL ,
	USER_ABSNCE_AT        CHAR(1)  NOT NULL ,
	FRST_REGISTER_ID      VARCHAR2(20)  NULL ,
	FRST_REGIST_PNTTM     DATE  NULL ,
	LAST_UPDUSR_ID        VARCHAR2(20)  NULL ,
	LAST_UPDT_PNTTM       DATE  NULL ,
CONSTRAINT  COMTNUSERABSNCE_PK PRIMARY KEY (EMPLYR_ID)
);




