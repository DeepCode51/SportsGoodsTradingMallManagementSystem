const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm6940b/",
            name: "ssm6940b",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6940b/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "运动品交易商城"
        } 
    }
}
export default base
