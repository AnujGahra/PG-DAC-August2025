import { useEffect } from "react"


function Counter({count, data}) {

    useEffect(() => {
        console.log("Mounting Phase Only");
        
    }, [])

    useEffect(() => {
        console.log("Update Phase Only");
        
    }, [count]);

    useEffect(() => {
        return () => {
            console.log("Unmount phase only");
            
        }
    }, [])

  return (
    <div>
        <h1>Counter Value {count}</h1>
        <h1>Data Value {data}</h1>
    </div>
  )
}

export default Counter