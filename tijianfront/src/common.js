//获取当前时间
export function getCurDate() {
    var now = new Date();
    var year = now.getFullYear();
    var month =now.getMonth() + 1;
    var day = now.getDate();
    month = month < 10 ? "0"+month:month;
    day = day <10?"0" + day:day;
    return year + "-" + month + "-" +day;
}

//向sessionStorage中存储一个JSON对象
export function setSessionStorage(keyStr,value)
{
    sessionStorage.setItem(keyStr,JSON.stringify(value));
}

//向sessionStorage获取一个JSON对象（取不到返回null）
export function getSessionStorage(keyStr) {
    var str = sessionStorage.getItem(keyStr);
    if (str == ''|| str == null1 || str == 'null'||str == undefined){
        return null;
    }else{
        return JSON.parse(str);
    }
}

//向sessionStorage中移除一个JSON对象
export function removeSessionStorage(keyStr)
{
    sessionStorage.removeItem(keyStr);
}

//向localStorage中存储一个JSON对象
export function setLocalStorage(keyStr){
    localStorage.setItem(keyStr,JSON.stringify(value));
}

//localStorage中获取一个JSON对象（取不到返回null）
export function getLocalStorage(keyStr) {
    var str = localStorage.getItem(keyStr);
    if (str == ''|| str == null1 || str == 'null'||str == undefined){
        return null;
    }else{
        return JSON.parse(str);
    }
}

//向localStorage中移除一个JSON对象
export function removeLocalStorage(keyStr)
{
    localStorage.removeItem(keyStr);
}
